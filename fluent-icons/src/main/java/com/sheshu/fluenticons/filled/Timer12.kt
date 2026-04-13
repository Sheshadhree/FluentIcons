package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Timer12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Timer12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 0f)
            curveTo(3.224f, 0f, 3f, 0.224f, 3f, 0.5f)
            reflectiveCurveTo(3.224f, 1f, 3.5f, 1f)
            horizontalLineToRelative(4f)
            curveTo(7.776f, 1f, 8f, 0.776f, 8f, 0.5f)
            reflectiveCurveTo(7.776f, 0f, 7.5f, 0f)
            horizontalLineToRelative(-4f)
            close()
            moveTo(1f, 6.5f)
            curveTo(1f, 4.015f, 3.015f, 2f, 5.5f, 2f)
            reflectiveCurveTo(10f, 4.015f, 10f, 6.5f)
            reflectiveCurveTo(7.985f, 11f, 5.5f, 11f)
            reflectiveCurveTo(1f, 8.985f, 1f, 6.5f)
            close()
            moveToRelative(4f, 1f)
            curveTo(5f, 7.776f, 5.224f, 8f, 5.5f, 8f)
            reflectiveCurveTo(6f, 7.776f, 6f, 7.5f)
            verticalLineToRelative(-3f)
            curveTo(6f, 4.224f, 5.776f, 4f, 5.5f, 4f)
            reflectiveCurveTo(5f, 4.224f, 5f, 4.5f)
            verticalLineToRelative(3f)
            close()
            moveToRelative(5.854f, -3.647f)
            curveToRelative(-0.195f, 0.196f, -0.511f, 0.196f, -0.707f, 0.001f)
            lineTo(9.145f, 2.856f)
            curveToRelative(-0.195f, -0.195f, -0.196f, -0.512f, 0f, -0.707f)
            curveToRelative(0.194f, -0.196f, 0.51f, -0.196f, 0.706f, -0.002f)
            lineToRelative(1.002f, 0.999f)
            curveToRelative(0.196f, 0.195f, 0.196f, 0.511f, 0.001f, 0.707f)
            close()
        }
    }.build()
}
