package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandYoutubeKids: ImageVector
    get() {
        if (_BrandYoutubeKids != null) {
            return _BrandYoutubeKids!!
        }
        _BrandYoutubeKids = ImageVector.Builder(
            name = "Filled.BrandYoutubeKids",
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
                moveTo(18.608f, 17.75f)
                lineToRelative(-3.9f, 0.268f)
                horizontalLineToRelative(-0.027f)
                arcToRelative(13.83f, 13.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.722f, 0.828f)
                lineToRelative(-2.511f, 0.908f)
                arcToRelative(4.111f, 4.111f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.287f, -0.216f)
                arcToRelative(3.82f, 3.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.98f, -2.527f)
                lineToRelative(-1.376f, -6.05f)
                arcToRelative(3.669f, 3.669f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.536f, -2.86f)
                arcToRelative(3.964f, 3.964f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.489f, -1.661f)
                lineToRelative(11.25f, -2.354f)
                curveToRelative(2.137f, -0.448f, 4.247f, 0.85f, 4.713f, 2.9f)
                lineToRelative(1.403f, 6.162f)
                arcToRelative(3.677f, 3.677f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.697f, 3.086f)
                arcToRelative(4.007f, 4.007f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.89f, 1.512f)
                verticalLineToRelative(0.002f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 10f)
                lineToRelative(1.208f, 5f)
                lineToRelative(4.292f, -4f)
                close()
            }
        }.build()

        return _BrandYoutubeKids!!
    }

@Suppress("ObjectPropertyName")
private var _BrandYoutubeKids: ImageVector? = null
