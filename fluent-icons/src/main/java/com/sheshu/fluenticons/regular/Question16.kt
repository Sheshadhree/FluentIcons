package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Question16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Question16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 2f)
            curveTo(6.344f, 2f, 5f, 3.344f, 5f, 5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveTo(6f, 5.276f, 6f, 5f)
            curveToRelative(0f, -1.104f, 0.896f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.896f, 2f, 2f)
            curveToRelative(0f, 0.676f, -0.14f, 1.08f, -0.315f, 1.36f)
            curveToRelative(-0.183f, 0.293f, -0.428f, 0.494f, -0.747f, 0.75f)
            lineToRelative(-0.02f, 0.015f)
            curveTo(8.616f, 7.367f, 8.246f, 7.662f, 7.967f, 8.11f)
            curveTo(7.673f, 8.58f, 7.5f, 9.176f, 7.5f, 10f)
            verticalLineToRelative(0.5f)
            curveTo(7.5f, 10.776f, 7.724f, 11f, 8f, 11f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(10f)
            curveToRelative(0f, -0.676f, 0.14f, -1.08f, 0.315f, -1.36f)
            curveToRelative(0.183f, -0.293f, 0.428f, -0.494f, 0.747f, -0.75f)
            lineToRelative(0.02f, -0.015f)
            curveToRelative(0.302f, -0.242f, 0.672f, -0.537f, 0.951f, -0.985f)
            curveTo(10.827f, 6.42f, 11f, 5.824f, 11f, 5f)
            curveToRelative(0f, -1.656f, -1.344f, -3f, -3f, -3f)
            close()
            moveToRelative(0f, 12f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(8.414f, 12.5f, 8f, 12.5f)
            reflectiveCurveToRelative(-0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveTo(7.586f, 14f, 8f, 14f)
            close()
        }
    }.build()
}
