package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Temperature16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Temperature16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 3.5f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            curveToRelative(1.656f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(5.354f)
            curveToRelative(0.622f, 0.705f, 1f, 1.632f, 1f, 2.646f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
            curveToRelative(0f, -1.014f, 0.378f, -1.941f, 1f, -2.646f)
            verticalLineTo(3.5f)
            close()
            moveToRelative(3f, -1.5f)
            curveTo(6.67f, 2f, 6f, 2.671f, 6f, 3.5f)
            verticalLineToRelative(5.975f)
            lineToRelative(-0.23f, 0.22f)
            curveTo(5.293f, 10.153f, 5f, 10.792f, 5f, 11.5f)
            curveTo(5f, 12.88f, 6.12f, 14f, 7.5f, 14f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            curveToRelative(0f, -0.71f, -0.294f, -1.348f, -0.77f, -1.804f)
            lineTo(9f, 9.474f)
            verticalLineTo(3.5f)
            curveTo(9f, 2.672f, 8.327f, 2f, 7.5f, 2f)
            close()
            moveTo(8f, 6f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            reflectiveCurveTo(7f, 5.724f, 7f, 6f)
            verticalLineToRelative(4.085f)
            curveToRelative(-0.583f, 0.206f, -1f, 0.762f, -1f, 1.415f)
            curveTo(6f, 12.328f, 6.67f, 13f, 7.5f, 13f)
            curveTo(8.328f, 13f, 9f, 12.328f, 9f, 11.5f)
            curveToRelative(0f, -0.653f, -0.417f, -1.209f, -1f, -1.415f)
            verticalLineTo(6f)
            close()
        }
    }.build()
}
