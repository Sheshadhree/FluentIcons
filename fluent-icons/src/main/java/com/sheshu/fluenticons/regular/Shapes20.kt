package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Shapes20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Shapes20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 3f)
            curveTo(5.015f, 3f, 3f, 5.015f, 3f, 7.5f)
            curveToRelative(0f, 2.316f, 1.75f, 4.224f, 4f, 4.473f)
            verticalLineToRelative(1.005f)
            curveTo(4.197f, 12.725f, 2f, 10.369f, 2f, 7.5f)
            curveTo(2f, 4.462f, 4.462f, 2f, 7.5f, 2f)
            curveToRelative(2.869f, 0f, 5.225f, 2.197f, 5.478f, 5f)
            horizontalLineToRelative(-1.005f)
            curveTo(11.723f, 4.75f, 9.816f, 3f, 7.5f, 3f)
            close()
            moveToRelative(3f, 5f)
            curveTo(9.12f, 8f, 8f, 9.12f, 8f, 10.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-5f)
            curveTo(18f, 9.12f, 16.88f, 8f, 15.5f, 8f)
            horizontalLineToRelative(-5f)
            close()
            moveTo(9f, 10.5f)
            curveTo(9f, 9.672f, 9.672f, 9f, 10.5f, 9f)
            horizontalLineToRelative(5f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-5f)
            curveTo(9.672f, 17f, 9f, 16.328f, 9f, 15.5f)
            verticalLineToRelative(-5f)
            close()
        }
    }.build()
}
