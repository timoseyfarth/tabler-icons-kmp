package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandMyOppo: ImageVector
    get() {
        if (_BrandMyOppo != null) {
            return _BrandMyOppo!!
        }
        _BrandMyOppo = ImageVector.Builder(
            name = "Filled.BrandMyOppo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.316f, 5f)
                horizontalLineToRelative(-12.632f)
                lineToRelative(-3.418f, 4.019f)
                arcToRelative(1.089f, 1.089f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.019f, 1.447f)
                lineToRelative(9.714f, 10.534f)
                lineToRelative(9.715f, -10.49f)
                arcToRelative(1.09f, 1.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.024f, -1.444f)
                lineToRelative(-3.422f, -4.066f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 11f)
                lineToRelative(3f, 3f)
                lineToRelative(3f, -3f)
            }
        }.build()

        return _BrandMyOppo!!
    }

@Suppress("ObjectPropertyName")
private var _BrandMyOppo: ImageVector? = null
