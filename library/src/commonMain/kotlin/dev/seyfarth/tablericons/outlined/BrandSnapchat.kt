package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandSnapchat: ImageVector
    get() {
        if (_BrandSnapchat != null) {
            return _BrandSnapchat!!
        }
        _BrandSnapchat = ImageVector.Builder(
            name = "Filled.BrandSnapchat",
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
                moveTo(16.882f, 7.842f)
                arcToRelative(4.882f, 4.882f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.764f, 0f)
                curveToRelative(0f, 4.273f, -0.213f, 6.409f, -4.118f, 8.118f)
                curveToRelative(2f, 0.882f, 2f, 0.882f, 3f, 3f)
                curveToRelative(3f, 0f, 4f, 2f, 6f, 2f)
                reflectiveCurveToRelative(3f, -2f, 6f, -2f)
                curveToRelative(1f, -2.118f, 1f, -2.118f, 3f, -3f)
                curveToRelative(-3.906f, -1.709f, -4.118f, -3.845f, -4.118f, -8.118f)
                close()
                moveTo(3f, 15.961f)
                curveToRelative(4f, -2.118f, 4f, -4.118f, 1f, -7.118f)
                moveToRelative(17f, 7.118f)
                curveToRelative(-4f, -2.118f, -4f, -4.118f, -1f, -7.118f)
            }
        }.build()

        return _BrandSnapchat!!
    }

@Suppress("ObjectPropertyName")
private var _BrandSnapchat: ImageVector? = null
