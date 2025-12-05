package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BrandCampaignmonitor: ImageVector
    get() {
        if (_BrandCampaignmonitor != null) {
            return _BrandCampaignmonitor!!
        }
        _BrandCampaignmonitor = ImageVector.Builder(
            name = "Filled.BrandCampaignmonitor",
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
                moveTo(3f, 18f)
                lineToRelative(9f, -6.462f)
                lineToRelative(-9f, -5.538f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-12f)
                lineToRelative(-9f, 5.538f)
            }
        }.build()

        return _BrandCampaignmonitor!!
    }

@Suppress("ObjectPropertyName")
private var _BrandCampaignmonitor: ImageVector? = null
