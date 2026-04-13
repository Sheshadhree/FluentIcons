package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PhoneCheckmark20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PhoneCheckmark20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 5.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(9f, 7.985f, 9f, 5.5f)
            reflectiveCurveTo(11.015f, 1f, 13.5f, 1f)
            reflectiveCurveTo(18f, 3.015f, 18f, 5.5f)
            close()
            moveToRelative(-2.146f, -1.853f)
            curveToRelative(-0.196f, -0.196f, -0.512f, -0.196f, -0.708f, 0f)
            lineTo(12.5f, 6.293f)
            lineToRelative(-0.646f, -0.647f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(1f, 1f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineToRelative(3f, -3f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            close()
            moveTo(6.5f, 2f)
            horizontalLineToRelative(2.757f)
            curveTo(8.472f, 2.95f, 8f, 4.17f, 8f, 5.5f)
            curveToRelative(0f, 3.038f, 2.462f, 5.5f, 5.5f, 5.5f)
            curveToRelative(0.52f, 0f, 1.023f, -0.072f, 1.5f, -0.207f)
            verticalLineTo(16.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7f)
            curveTo(5.672f, 18f, 5f, 17.328f, 5f, 16.5f)
            verticalLineToRelative(-13f)
            curveTo(5f, 2.672f, 5.672f, 2f, 6.5f, 2f)
            close()
            moveTo(8f, 14.5f)
            curveTo(8f, 14.776f, 8.224f, 15f, 8.5f, 15f)
            horizontalLineToRelative(3f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(11.776f, 14f, 11.5f, 14f)
            horizontalLineToRelative(-3f)
            curveTo(8.224f, 14f, 8f, 14.224f, 8f, 14.5f)
            close()
        }
    }.build()
}
