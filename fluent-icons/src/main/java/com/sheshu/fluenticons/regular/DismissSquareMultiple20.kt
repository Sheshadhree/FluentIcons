package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DismissSquareMultiple20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DismissSquareMultiple20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 5.5f)
            curveTo(3f, 4.12f, 4.12f, 3f, 5.5f, 3f)
            horizontalLineToRelative(7f)
            curveTo(13.88f, 3f, 15f, 4.12f, 15f, 5.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-7f)
            curveTo(4.12f, 15f, 3f, 13.88f, 3f, 12.5f)
            verticalLineToRelative(-7f)
            close()
            moveTo(5.5f, 4f)
            curveTo(4.672f, 4f, 4f, 4.672f, 4f, 5.5f)
            verticalLineToRelative(7f)
            curveTo(4f, 13.328f, 4.672f, 14f, 5.5f, 14f)
            horizontalLineToRelative(7f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-7f)
            curveTo(14f, 4.672f, 13.328f, 4f, 12.5f, 4f)
            horizontalLineToRelative(-7f)
            close()
            moveToRelative(2f, 13f)
            curveToRelative(-0.818f, 0f, -1.544f, -0.393f, -2f, -1f)
            horizontalLineToRelative(7f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineToRelative(-7f)
            curveToRelative(0.607f, 0.456f, 1f, 1.182f, 1f, 2f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 2.486f, -2.014f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-5f)
            close()
            moveTo(6.854f, 6.146f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineTo(8.293f, 9f)
            lineToRelative(-2.146f, 2.146f)
            curveToRelative(-0.196f, 0.196f, -0.196f, 0.512f, 0f, 0.708f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            lineTo(9f, 9.707f)
            lineToRelative(2.146f, 2.147f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineTo(9.707f, 9f)
            lineToRelative(2.147f, -2.146f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineTo(9f, 8.293f)
            lineTo(6.854f, 6.147f)
            close()
        }
    }.build()
}
