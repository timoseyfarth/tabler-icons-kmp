package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.MessageChatbot: ImageVector
    get() {
        if (_MessageChatbot != null) {
            return _MessageChatbot!!
        }
        _MessageChatbot = ImageVector.Builder(
            name = "Filled.MessageChatbot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 3f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                verticalLineToRelative(8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 4f)
                horizontalLineToRelative(-4.724f)
                lineToRelative(-4.762f, 2.857f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.508f, -0.743f)
                lineToRelative(-0.006f, -0.114f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.995f, -3.8f)
                lineToRelative(-0.005f, -0.2f)
                verticalLineToRelative(-8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -4f)
                close()
                moveTo(15.2f, 12.286f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.414f, 0.014f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.572f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.428f, 1.4f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.428f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.014f, -1.414f)
                moveToRelative(-5.69f, -4.286f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(0.01f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                moveToRelative(5f, 0f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(0.01f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
            }
        }.build()

        return _MessageChatbot!!
    }

@Suppress("ObjectPropertyName")
private var _MessageChatbot: ImageVector? = null
