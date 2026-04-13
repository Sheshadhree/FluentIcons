package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CommentCheckmark12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CommentCheckmark12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 3.5f)
            curveTo(12f, 5.433f, 10.433f, 7f, 8.5f, 7f)
            reflectiveCurveTo(5f, 5.433f, 5f, 3.5f)
            reflectiveCurveTo(6.567f, 0f, 8.5f, 0f)
            reflectiveCurveTo(12f, 1.567f, 12f, 3.5f)
            close()
            moveToRelative(-1.646f, -1.353f)
            curveToRelative(-0.196f, -0.196f, -0.512f, -0.196f, -0.707f, 0f)
            lineTo(8f, 3.792f)
            lineTo(7.354f, 3.146f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(1f, 1f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineToRelative(2f, -2f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            close()
            moveTo(8.5f, 8f)
            curveToRelative(0.918f, 0f, 1.772f, -0.275f, 2.484f, -0.747f)
            curveTo(10.86f, 8.238f, 10.02f, 9f, 9f, 9f)
            horizontalLineTo(6.651f)
            lineToRelative(-2.874f, 1.916f)
            curveToRelative(-0.153f, 0.102f, -0.35f, 0.112f, -0.513f, 0.025f)
            curveTo(3.102f, 10.854f, 3f, 10.684f, 3f, 10.5f)
            verticalLineTo(9f)
            curveTo(1.895f, 9f, 1f, 8.105f, 1f, 7f)
            verticalLineTo(3f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(1.758f)
            curveTo(4.279f, 1.715f, 4f, 2.575f, 4f, 3.5f)
            curveTo(4f, 5.985f, 6.015f, 8f, 8.5f, 8f)
            close()
        }
    }.build()
}
