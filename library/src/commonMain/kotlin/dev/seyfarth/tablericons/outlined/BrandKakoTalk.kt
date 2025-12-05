package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandKakoTalk: ImageVector
    get() {
        if (_BrandKakoTalk != null) {
            return _BrandKakoTalk!!
        }
        _BrandKakoTalk = ImageVector.Builder(
            name = "Filled.BrandKakoTalk",
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
                moveTo(10f, 8f)
                verticalLineToRelative(7f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 10f)
                lineToRelative(-2f, 2.5f)
                lineToRelative(2f, 2.5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 4f)
                curveToRelative(4.97f, 0f, 9f, 3.358f, 9f, 7.5f)
                curveToRelative(0f, 4.142f, -4.03f, 7.5f, -9f, 7.5f)
                curveToRelative(-0.67f, 0f, -1.323f, -0.061f, -1.95f, -0.177f)
                lineToRelative(-3.05f, 2.177f)
                lineToRelative(0.592f, -2.962f)
                curveToRelative(-2.741f, -1.284f, -4.592f, -3.73f, -4.592f, -6.538f)
                curveToRelative(0f, -4.142f, 4.03f, -7.5f, 9f, -7.5f)
                close()
            }
        }.build()

        return _BrandKakoTalk!!
    }

@Suppress("ObjectPropertyName")
private var _BrandKakoTalk: ImageVector? = null
