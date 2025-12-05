package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Clover: ImageVector
    get() {
        if (_Clover != null) {
            return _Clover!!
        }
        _Clover = ImageVector.Builder(
            name = "Filled.Clover",
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
                moveTo(12f, 10f)
                lineToRelative(-3.397f, -3.44f)
                arcToRelative(2.104f, 2.104f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2.95f)
                arcToRelative(2.04f, 2.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.912f, 0f)
                lineToRelative(0.485f, 0.39f)
                lineToRelative(0.485f, -0.39f)
                arcToRelative(2.04f, 2.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.912f, 0f)
                arcToRelative(2.104f, 2.104f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.95f)
                lineToRelative(-3.397f, 3.44f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 14f)
                lineToRelative(-3.397f, 3.44f)
                arcToRelative(2.104f, 2.104f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2.95f)
                arcToRelative(2.04f, 2.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.912f, 0f)
                lineToRelative(0.485f, -0.39f)
                lineToRelative(0.485f, 0.39f)
                arcToRelative(2.04f, 2.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.912f, 0f)
                arcToRelative(2.104f, 2.104f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2.95f)
                lineToRelative(-3.397f, -3.44f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 12f)
                lineToRelative(3.44f, -3.397f)
                arcToRelative(2.104f, 2.104f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.95f, 0f)
                arcToRelative(2.04f, 2.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.912f)
                lineToRelative(-0.39f, 0.485f)
                lineToRelative(0.39f, 0.485f)
                arcToRelative(2.04f, 2.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.912f)
                arcToRelative(2.104f, 2.104f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.95f, 0f)
                lineToRelative(-3.44f, -3.397f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 12f)
                lineToRelative(-3.44f, -3.397f)
                arcToRelative(2.104f, 2.104f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.95f, 0f)
                arcToRelative(2.04f, 2.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2.912f)
                lineToRelative(0.39f, 0.485f)
                lineToRelative(-0.39f, 0.485f)
                arcToRelative(2.04f, 2.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2.912f)
                arcToRelative(2.104f, 2.104f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.95f, 0f)
                lineToRelative(3.44f, -3.397f)
                close()
            }
        }.build()

        return _Clover!!
    }

@Suppress("ObjectPropertyName")
private var _Clover: ImageVector? = null
