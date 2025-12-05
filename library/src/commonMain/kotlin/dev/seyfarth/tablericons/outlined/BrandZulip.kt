package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandZulip: ImageVector
    get() {
        if (_BrandZulip != null) {
            return _BrandZulip!!
        }
        _BrandZulip = ImageVector.Builder(
            name = "Filled.BrandZulip",
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
                moveTo(6.5f, 3f)
                horizontalLineToRelative(11f)
                curveToRelative(1.325f, 0f, 2.5f, 1f, 2.5f, 2.5f)
                curveToRelative(0f, 2f, -1.705f, 3.264f, -2f, 3.5f)
                lineToRelative(-4.5f, 4f)
                lineToRelative(2f, -5f)
                horizontalLineToRelative(-9f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -5f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.5f, 21f)
                horizontalLineToRelative(-11f)
                curveToRelative(-1.325f, 0f, -2.5f, -1f, -2.5f, -2.5f)
                curveToRelative(0f, -2f, 1.705f, -3.264f, 2f, -3.5f)
                lineToRelative(4.5f, -4f)
                lineToRelative(-2f, 5f)
                horizontalLineToRelative(9f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 5f)
                close()
            }
        }.build()

        return _BrandZulip!!
    }

@Suppress("ObjectPropertyName")
private var _BrandZulip: ImageVector? = null
