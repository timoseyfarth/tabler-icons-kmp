package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.ZodiacAquarius: ImageVector
    get() {
        if (_ZodiacAquarius != null) {
            return _ZodiacAquarius!!
        }
        _ZodiacAquarius = ImageVector.Builder(
            name = "Filled.ZodiacAquarius",
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
                moveTo(3f, 10f)
                lineToRelative(3f, -3f)
                lineToRelative(3f, 3f)
                lineToRelative(3f, -3f)
                lineToRelative(3f, 3f)
                lineToRelative(3f, -3f)
                lineToRelative(3f, 3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 17f)
                lineToRelative(3f, -3f)
                lineToRelative(3f, 3f)
                lineToRelative(3f, -3f)
                lineToRelative(3f, 3f)
                lineToRelative(3f, -3f)
                lineToRelative(3f, 3f)
            }
        }.build()

        return _ZodiacAquarius!!
    }

@Suppress("ObjectPropertyName")
private var _ZodiacAquarius: ImageVector? = null
