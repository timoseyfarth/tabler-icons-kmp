package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandCodesandbox: ImageVector
    get() {
        if (_BrandCodesandbox != null) {
            return _BrandCodesandbox!!
        }
        _BrandCodesandbox = ImageVector.Builder(
            name = "Filled.BrandCodesandbox",
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
                moveTo(20f, 7.5f)
                verticalLineToRelative(9f)
                lineToRelative(-4f, 2.25f)
                lineToRelative(-4f, 2.25f)
                lineToRelative(-4f, -2.25f)
                lineToRelative(-4f, -2.25f)
                verticalLineToRelative(-9f)
                lineToRelative(4f, -2.25f)
                lineToRelative(4f, -2.25f)
                lineToRelative(4f, 2.25f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                lineToRelative(4f, -2.25f)
                lineToRelative(4f, -2.25f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                lineToRelative(0f, 9f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                lineToRelative(-4f, -2.25f)
                lineToRelative(-4f, -2.25f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 12f)
                lineToRelative(-4f, 2f)
                verticalLineToRelative(4.75f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 12f)
                lineToRelative(4f, 2f)
                lineToRelative(0f, 4.75f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 5.25f)
                lineToRelative(4f, 2.25f)
                lineToRelative(4f, -2.25f)
            }
        }.build()

        return _BrandCodesandbox!!
    }

@Suppress("ObjectPropertyName")
private var _BrandCodesandbox: ImageVector? = null
