package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.MedicalCross: ImageVector
    get() {
        if (_MedicalCross != null) {
            return _MedicalCross!!
        }
        _MedicalCross = ImageVector.Builder(
            name = "Filled.MedicalCross",
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
                moveTo(13f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(4.535f)
                lineToRelative(3.928f, -2.267f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.366f, 0.366f)
                lineToRelative(1f, 1.732f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.366f, 1.366f)
                lineToRelative(-3.927f, 2.268f)
                lineToRelative(3.927f, 2.269f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.366f, 1.366f)
                lineToRelative(-1f, 1.732f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.366f, 0.366f)
                lineToRelative(-3.928f, -2.269f)
                verticalLineToRelative(4.536f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineToRelative(-4.536f)
                lineToRelative(-3.928f, 2.268f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.366f, -0.366f)
                lineToRelative(-1f, -1.732f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.366f, -1.366f)
                lineToRelative(3.927f, -2.268f)
                lineToRelative(-3.927f, -2.268f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.366f, -1.366f)
                lineToRelative(1f, -1.732f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.366f, -0.366f)
                lineToRelative(3.928f, 2.267f)
                verticalLineToRelative(-4.535f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(2f)
                close()
            }
        }.build()

        return _MedicalCross!!
    }

@Suppress("ObjectPropertyName")
private var _MedicalCross: ImageVector? = null
