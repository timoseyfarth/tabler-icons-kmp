package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.CategoryPlus: ImageVector
    get() {
        if (_CategoryPlus != null) {
            return _CategoryPlus!!
        }
        _CategoryPlus = ImageVector.Builder(
            name = "Filled.CategoryPlus",
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
                moveTo(4f, 4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(14f, 4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(4f, 14f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(14f, 17f)
                horizontalLineToRelative(6f)
                moveToRelative(-3f, -3f)
                verticalLineToRelative(6f)
            }
        }.build()

        return _CategoryPlus!!
    }

@Suppress("ObjectPropertyName")
private var _CategoryPlus: ImageVector? = null
