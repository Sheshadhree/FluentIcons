package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Script16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Script16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.999f, 1f)
            curveToRelative(0.08f, 0f, 0.17f, 0.01f, 0.25f, 0.02f)
            curveToRelative(0.09f, 0.01f, 0.17f, 0.03f, 0.25f, 0.05f)
            curveToRelative(-0.8f, 0.21f, -1.4f, 0.89f, -1.48f, 1.73f)
            lineToRelative(-0.017f, 0.145f)
            lineTo(12f, 2.96f)
            verticalLineTo(13.5f)
            curveToRelative(0f, 0.828f, -0.673f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveTo(9f, 14.327f, 9f, 13.5f)
            verticalLineTo(12f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(3f)
            verticalLineTo(3.5f)
            curveTo(3f, 2.119f, 4.119f, 1f, 5.5f, 1f)
            horizontalLineToRelative(7.499f)
            close()
            moveTo(8f, 12f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.565f, 0.196f, 1.081f, 0.513f, 1.5f)
            horizontalLineTo(8.278f)
            lineToRelative(-3.106f, 0.002f)
            lineToRelative(0.378f, 0.001f)
            curveTo(4.224f, 15.005f, 3.48f, 15.006f, 3.05f, 15f)
            horizontalLineTo(3f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineToRelative(-0.5f)
            curveTo(1f, 12.224f, 1.224f, 12f, 1.5f, 12f)
            horizontalLineTo(8f)
            close()
            moveToRelative(6f, -10f)
            curveToRelative(-0.18f, 0f, -0.35f, 0.05f, -0.5f, 0.14f)
            curveTo(13.2f, 2.31f, 13f, 2.63f, 13f, 3f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(1f)
            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
            verticalLineTo(3f)
            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
            close()
        }
    }.build()
}
