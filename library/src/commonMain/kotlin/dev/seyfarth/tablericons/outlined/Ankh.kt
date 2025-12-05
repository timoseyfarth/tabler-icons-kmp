package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Ankh: ImageVector
    get() {
        if (_Ankh != null) {
            return _Ankh!!
        }
        _Ankh = ImageVector.Builder(
            name = "Filled.Ankh",
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
                moveTo(6f, 13f)
                horizontalLineToRelative(12f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 21f)
                verticalLineToRelative(-8f)
                lineToRelative(-0.422f, -0.211f)
                arcToRelative(6.472f, 6.472f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.578f, -5.789f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, 0f)
                arcToRelative(6.472f, 6.472f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.578f, 5.789f)
                lineToRelative(-0.422f, 0.211f)
            }
        }.build()

        return _Ankh!!
    }

@Suppress("ObjectPropertyName")
private var _Ankh: ImageVector? = null
