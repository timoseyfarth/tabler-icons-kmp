package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Perspective: ImageVector
    get() {
        if (_Perspective != null) {
            return _Perspective!!
        }
        _Perspective = ImageVector.Builder(
            name = "Filled.Perspective",
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
                moveTo(6.141f, 4.163f)
                lineToRelative(12f, 1.714f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.859f, 0.99f)
                verticalLineToRelative(10.266f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.859f, 0.99f)
                lineToRelative(-12f, 1.714f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.141f, -0.99f)
                verticalLineToRelative(-13.694f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.141f, -0.99f)
                close()
            }
        }.build()

        return _Perspective!!
    }

@Suppress("ObjectPropertyName")
private var _Perspective: ImageVector? = null
