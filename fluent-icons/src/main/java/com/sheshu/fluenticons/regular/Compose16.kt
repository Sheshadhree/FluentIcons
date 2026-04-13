package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Compose16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Compose16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.5f, 3f)
            curveTo(8.776f, 3f, 9f, 3.224f, 9f, 3.5f)
            reflectiveCurveTo(8.776f, 4f, 8.5f, 4f)
            horizontalLineToRelative(-4f)
            curveTo(3.672f, 4f, 3f, 4.672f, 3f, 5.5f)
            verticalLineToRelative(6f)
            curveTo(3f, 12.328f, 3.672f, 13f, 4.5f, 13f)
            horizontalLineToRelative(6f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-4f)
            curveTo(12f, 7.224f, 12.224f, 7f, 12.5f, 7f)
            reflectiveCurveTo(13f, 7.224f, 13f, 7.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-6f)
            curveTo(3.12f, 14f, 2f, 12.88f, 2f, 11.5f)
            verticalLineToRelative(-6f)
            curveTo(2f, 4.12f, 3.12f, 3f, 4.5f, 3f)
            horizontalLineToRelative(4f)
            close()
            moveToRelative(4.646f, -0.853f)
            curveToRelative(0.196f, -0.196f, 0.512f, -0.196f, 0.707f, 0f)
            curveToRelative(0.196f, 0.195f, 0.196f, 0.511f, 0f, 0.707f)
            lineTo(7.062f, 9.646f)
            lineTo(6f, 10f)
            lineToRelative(0.354f, -1.06f)
            lineToRelative(6.792f, -6.793f)
            close()
        }
    }.build()
}
