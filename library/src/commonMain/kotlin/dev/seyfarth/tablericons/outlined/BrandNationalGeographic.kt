package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandNationalGeographic: ImageVector
    get() {
        if (_BrandNationalGeographic != null) {
            return _BrandNationalGeographic!!
        }
        _BrandNationalGeographic = ImageVector.Builder(
            name = "Filled.BrandNationalGeographic",
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
                moveTo(7f, 3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(-10f)
                close()
            }
        }.build()

        return _BrandNationalGeographic!!
    }

@Suppress("ObjectPropertyName")
private var _BrandNationalGeographic: ImageVector? = null
