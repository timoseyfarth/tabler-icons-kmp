package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.CloudDataConnection: ImageVector
    get() {
        if (_CloudDataConnection != null) {
            return _CloudDataConnection!!
        }
        _CloudDataConnection = ImageVector.Builder(
            name = "Filled.CloudDataConnection",
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
                moveTo(5f, 9.897f)
                curveToRelative(0f, -1.714f, 1.46f, -3.104f, 3.26f, -3.104f)
                curveToRelative(0.275f, -1.22f, 1.255f, -2.215f, 2.572f, -2.611f)
                curveToRelative(1.317f, -0.397f, 2.77f, -0.134f, 3.811f, 0.69f)
                curveToRelative(1.042f, 0.822f, 1.514f, 2.08f, 1.239f, 3.3f)
                horizontalLineToRelative(0.693f)
                arcToRelative(2.42f, 2.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.425f, 2.414f)
                arcToRelative(2.42f, 2.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.425f, 2.414f)
                horizontalLineToRelative(-8.315f)
                curveToRelative(-1.8f, 0f, -3.26f, -1.39f, -3.26f, -3.103f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 13f)
                verticalLineToRelative(3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 18f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, -4f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 18f)
                horizontalLineToRelative(7f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 18f)
                horizontalLineToRelative(7f)
            }
        }.build()

        return _CloudDataConnection!!
    }

@Suppress("ObjectPropertyName")
private var _CloudDataConnection: ImageVector? = null
