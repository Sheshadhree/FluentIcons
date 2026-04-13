package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PhoneUpdate20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PhoneUpdate20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
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
            moveToRelative(5.5f, 3f)
            curveTo(10.5f, 6.224f, 10.276f, 6f, 10f, 6f)
            reflectiveCurveTo(9.5f, 6.224f, 9.5f, 6.5f)
            verticalLineToRelative(5.793f)
            lineToRelative(-1.146f, -1.147f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            curveToRelative(-0.196f, 0.196f, -0.196f, 0.512f, 0f, 0.708f)
            lineToRelative(2f, 2f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            lineToRelative(2f, -2f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineTo(10.5f, 12.293f)
            verticalLineTo(6.5f)
            close()
        }
    }.build()
}
