package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.School: ImageVector
    get() {
        if (_School != null) {
            return _School!!
        }
        _School = ImageVector.Builder(
            name = "Filled.School",
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
                moveTo(22f, 9f)
                lineToRelative(-10f, -4f)
                lineToRelative(-10f, 4f)
                lineToRelative(10f, 4f)
                lineToRelative(10f, -4f)
                verticalLineToRelative(6f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 10.6f)
                verticalLineToRelative(5.4f)
                arcToRelative(6f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                verticalLineToRelative(-5.4f)
            }
        }.build()

        return _School!!
    }

@Suppress("ObjectPropertyName")
private var _School: ImageVector? = null
