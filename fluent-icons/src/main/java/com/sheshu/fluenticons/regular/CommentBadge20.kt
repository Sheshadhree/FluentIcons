package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CommentBadge20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CommentBadge20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 6f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            close()
            moveToRelative(0f, 1f)
            curveToRelative(0.35f, 0f, 0.687f, -0.06f, 1f, -0.17f)
            verticalLineToRelative(5.446f)
            curveToRelative(0f, 1.418f, -1.164f, 2.566f, -2.6f, 2.566f)
            horizontalLineToRelative(-4.59f)
            lineToRelative(-4.011f, 2.961f)
            curveToRelative(-0.442f, 0.327f, -1.069f, 0.238f, -1.4f, -0.199f)
            curveToRelative(-0.13f, -0.17f, -0.199f, -0.378f, -0.199f, -0.59f)
            verticalLineToRelative(-2.172f)
            horizontalLineTo(4.6f)
            curveToRelative(-1.436f, 0f, -2.6f, -1.149f, -2.6f, -2.566f)
            verticalLineToRelative(-6.71f)
            curveTo(2f, 4.149f, 3.164f, 3f, 4.6f, 3f)
            horizontalLineToRelative(9.57f)
            curveTo(14.06f, 3.313f, 14f, 3.65f, 14f, 4f)
            horizontalLineTo(4.6f)
            curveTo(3.704f, 4f, 3f, 4.713f, 3f, 5.566f)
            verticalLineToRelative(6.71f)
            curveToRelative(0f, 0.853f, 0.704f, 1.566f, 1.6f, 1.566f)
            horizontalLineToRelative(1.6f)
            verticalLineTo(17f)
            horizontalLineToRelative(0.003f)
            lineToRelative(0.002f, -0.001f)
            lineToRelative(4.276f, -3.157f)
            horizontalLineTo(15.4f)
            curveToRelative(0.896f, 0f, 1.6f, -0.713f, 1.6f, -1.566f)
            verticalLineTo(7f)
            close()
        }
    }.build()
}
