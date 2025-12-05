package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Clubs: ImageVector
    get() {
        if (_Clubs != null) {
            return _Clubs!!
        }
        _Clubs = ImageVector.Builder(
            name = "Filled.Clubs",
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
                moveTo(12f, 3f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.164f, 6.447f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.164f, 6.198f)
                verticalLineToRelative(1.355f)
                lineToRelative(1f, 4f)
                horizontalLineToRelative(-6f)
                lineToRelative(1f, -4f)
                lineToRelative(0f, -1.355f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.164f, -6.199f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.163f, -6.446f)
                close()
            }
        }.build()

        return _Clubs!!
    }

@Suppress("ObjectPropertyName")
private var _Clubs: ImageVector? = null
