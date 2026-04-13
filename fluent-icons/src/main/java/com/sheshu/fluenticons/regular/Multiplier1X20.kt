package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Multiplier1X20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Multiplier1X20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 6.5f)
            curveToRelative(0f, -0.215f, -0.137f, -0.405f, -0.34f, -0.474f)
            curveToRelative(-0.204f, -0.068f, -0.428f, 0f, -0.558f, 0.172f)
            curveToRelative(-0.075f, 0.098f, -0.147f, 0.2f, -0.22f, 0.306f)
            curveToRelative(-0.33f, 0.472f, -0.702f, 1.005f, -1.64f, 1.567f)
            curveToRelative(-0.236f, 0.142f, -0.313f, 0.45f, -0.17f, 0.686f)
            curveToRelative(0.14f, 0.237f, 0.448f, 0.314f, 0.684f, 0.173f)
            curveTo(6.302f, 8.602f, 6.698f, 8.269f, 7f, 7.957f)
            verticalLineTo(13.5f)
            curveTo(7f, 13.776f, 7.224f, 14f, 7.5f, 14f)
            reflectiveCurveTo(8f, 13.776f, 8f, 13.5f)
            verticalLineToRelative(-7f)
            close()
            moveToRelative(2.854f, 3.646f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.707f)
            lineTo(11.293f, 12f)
            lineToRelative(-1.147f, 1.146f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.512f, 0f, 0.707f)
            curveToRelative(0.196f, 0.196f, 0.512f, 0.196f, 0.708f, 0f)
            lineTo(12f, 12.707f)
            lineToRelative(1.146f, 1.146f)
            curveToRelative(0.196f, 0.196f, 0.512f, 0.196f, 0.708f, 0f)
            curveToRelative(0.195f, -0.195f, 0.195f, -0.512f, 0f, -0.707f)
            lineTo(12.707f, 12f)
            lineToRelative(1.147f, -1.147f)
            curveToRelative(0.195f, -0.195f, 0.195f, -0.511f, 0f, -0.707f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineTo(12f, 11.293f)
            lineToRelative(-1.146f, -1.147f)
            close()
        }
    }.build()
}
