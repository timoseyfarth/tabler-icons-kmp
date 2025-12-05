package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandDatabricks: ImageVector
    get() {
        if (_BrandDatabricks != null) {
            return _BrandDatabricks!!
        }
        _BrandDatabricks = ImageVector.Builder(
            name = "Filled.BrandDatabricks",
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
                moveTo(3f, 17f)
                lineToRelative(9f, 5f)
                lineToRelative(9f, -5f)
                verticalLineToRelative(-3f)
                lineToRelative(-9f, 5f)
                lineToRelative(-9f, -5f)
                verticalLineToRelative(-3f)
                lineToRelative(9f, 5f)
                lineToRelative(9f, -5f)
                verticalLineToRelative(-3f)
                lineToRelative(-9f, 5f)
                lineToRelative(-9f, -5f)
                lineToRelative(9f, -5f)
                lineToRelative(5.418f, 3.01f)
            }
        }.build()

        return _BrandDatabricks!!
    }

@Suppress("ObjectPropertyName")
private var _BrandDatabricks: ImageVector? = null
