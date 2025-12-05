package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandGooglePlay: ImageVector
    get() {
        if (_BrandGooglePlay != null) {
            return _BrandGooglePlay!!
        }
        _BrandGooglePlay = ImageVector.Builder(
            name = "Filled.BrandGooglePlay",
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
                moveTo(4f, 3.71f)
                verticalLineToRelative(16.58f)
                arcToRelative(0.7f, 0.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.05f, 0.606f)
                lineToRelative(14.622f, -8.42f)
                arcToRelative(0.55f, 0.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -0.953f)
                lineToRelative(-14.622f, -8.419f)
                arcToRelative(0.7f, 0.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.05f, 0.607f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 9f)
                lineToRelative(-10.5f, 11.5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.5f, 3.5f)
                lineToRelative(10.5f, 11.5f)
            }
        }.build()

        return _BrandGooglePlay!!
    }

@Suppress("ObjectPropertyName")
private var _BrandGooglePlay: ImageVector? = null
