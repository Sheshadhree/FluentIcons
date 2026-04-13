package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TableSimpleInclude16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TableSimpleInclude16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 4.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineToRelative(2.764f)
            curveToRelative(-0.258f, -0.289f, -0.462f, -0.627f, -0.593f, -1f)
            horizontalLineTo(4.5f)
            curveTo(3.672f, 13f, 3f, 12.328f, 3f, 11.5f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(3.67f)
            curveToRelative(0.132f, -0.373f, 0.336f, -0.712f, 0.594f, -1f)
            horizontalLineTo(3f)
            verticalLineToRelative(-3f)
            curveTo(3f, 3.672f, 3.672f, 3f, 4.5f, 3f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(4.264f)
            curveToRelative(0.288f, -0.258f, 0.627f, -0.462f, 1f, -0.593f)
            verticalLineTo(3f)
            horizontalLineToRelative(3f)
            curveTo(12.328f, 3f, 13f, 3.672f, 13f, 4.5f)
            verticalLineToRelative(2.17f)
            curveToRelative(0.373f, 0.132f, 0.711f, 0.336f, 1f, 0.594f)
            verticalLineTo(4.5f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-7f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            close()
            moveToRelative(5.5f, 4.75f)
            curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
            horizontalLineToRelative(3f)
            curveTo(13.216f, 7.5f, 14f, 8.284f, 14f, 9.25f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.784f, -1.75f, -1.75f)
            verticalLineToRelative(-3f)
            close()
        }
    }.build()
}
