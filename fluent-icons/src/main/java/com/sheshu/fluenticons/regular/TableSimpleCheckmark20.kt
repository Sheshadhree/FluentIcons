package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TableSimpleCheckmark20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TableSimpleCheckmark20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 3f)
            curveTo(4.343f, 3f, 3f, 4.343f, 3f, 6f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(8f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(6f)
            close()
            moveTo(4f, 6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(3.5f)
            verticalLineToRelative(5.5f)
            horizontalLineTo(4f)
            verticalLineTo(6f)
            close()
            moveToRelative(6.5f, 3.5f)
            verticalLineTo(4f)
            horizontalLineTo(14f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(3.5f)
            horizontalLineToRelative(-5.5f)
            close()
            moveToRelative(-6.5f, 1f)
            horizontalLineToRelative(5.5f)
            verticalLineTo(16f)
            horizontalLineTo(6f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineToRelative(-3.5f)
            close()
            moveToRelative(10.856f, 1.396f)
            curveToRelative(0.196f, 0.196f, 0.196f, 0.512f, 0f, 0.708f)
            lineToRelative(-1.75f, 1.75f)
            curveToRelative(-0.195f, 0.195f, -0.51f, 0.195f, -0.706f, 0f)
            lineToRelative(-0.753f, -0.75f)
            curveToRelative(-0.196f, -0.195f, -0.196f, -0.511f, -0.001f, -0.707f)
            curveToRelative(0.195f, -0.196f, 0.511f, -0.196f, 0.707f, -0.001f)
            lineToRelative(0.4f, 0.397f)
            lineToRelative(1.396f, -1.397f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.707f, 0f)
            close()
        }
    }.build()
}
