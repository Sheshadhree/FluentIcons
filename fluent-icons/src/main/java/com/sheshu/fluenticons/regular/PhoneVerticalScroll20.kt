package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PhoneVerticalScroll20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PhoneVerticalScroll20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.646f, 11.146f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineTo(10f, 12.793f)
            lineToRelative(1.646f, -1.647f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(-2f, 2f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.707f, 0f)
            lineToRelative(-2f, -2f)
            curveToRelative(-0.196f, -0.196f, -0.196f, -0.512f, 0f, -0.708f)
            close()
            moveToRelative(4f, -2.293f)
            curveToRelative(0.196f, 0.196f, 0.512f, 0.196f, 0.708f, 0f)
            curveToRelative(0.195f, -0.195f, 0.195f, -0.511f, 0f, -0.707f)
            lineToRelative(-2f, -2f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            lineToRelative(-2f, 2f)
            curveToRelative(-0.196f, 0.196f, -0.196f, 0.512f, 0f, 0.707f)
            curveToRelative(0.195f, 0.196f, 0.511f, 0.196f, 0.707f, 0f)
            lineTo(10f, 7.208f)
            lineToRelative(1.646f, 1.647f)
            close()
            moveTo(5f, 3.5f)
            curveTo(5f, 2.672f, 5.672f, 2f, 6.5f, 2f)
            horizontalLineToRelative(7f)
            curveTo(14.328f, 2f, 15f, 2.672f, 15f, 3.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7f)
            curveTo(5.672f, 18f, 5f, 17.328f, 5f, 16.5f)
            verticalLineToRelative(-13f)
            close()
            moveTo(6.5f, 3f)
            curveTo(6.224f, 3f, 6f, 3.224f, 6f, 3.5f)
            verticalLineToRelative(13f)
            curveTo(6f, 16.776f, 6.224f, 17f, 6.5f, 17f)
            horizontalLineToRelative(7f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-13f)
            curveTo(14f, 3.224f, 13.776f, 3f, 13.5f, 3f)
            horizontalLineToRelative(-7f)
            close()
        }
    }.build()
}
