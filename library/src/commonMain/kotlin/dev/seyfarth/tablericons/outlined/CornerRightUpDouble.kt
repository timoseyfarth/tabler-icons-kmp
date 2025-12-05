package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.CornerRightUpDouble: ImageVector
    get() {
        if (_CornerRightUpDouble != null) {
            return _CornerRightUpDouble!!
        }
        _CornerRightUpDouble = ImageVector.Builder(
            name = "Filled.CornerRightUpDouble",
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
                moveTo(5f, 19f)
                horizontalLineToRelative(6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineToRelative(-7f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 13f)
                lineToRelative(4f, -4f)
                lineToRelative(4f, 4f)
                moveToRelative(-8f, -5f)
                lineToRelative(4f, -4f)
                lineToRelative(4f, 4f)
            }
        }.build()

        return _CornerRightUpDouble!!
    }

@Suppress("ObjectPropertyName")
private var _CornerRightUpDouble: ImageVector? = null
