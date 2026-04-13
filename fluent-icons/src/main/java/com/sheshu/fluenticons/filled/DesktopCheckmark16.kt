package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DesktopCheckmark16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DesktopCheckmark16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 5.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(6f, 7.985f, 6f, 5.5f)
            reflectiveCurveTo(8.015f, 1f, 10.5f, 1f)
            reflectiveCurveTo(15f, 3.015f, 15f, 5.5f)
            close()
            moveToRelative(-2.146f, -1.853f)
            curveToRelative(-0.196f, -0.196f, -0.512f, -0.196f, -0.708f, 0f)
            lineTo(9.5f, 6.293f)
            lineTo(8.854f, 5.646f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            curveToRelative(-0.196f, 0.196f, -0.196f, 0.512f, 0f, 0.708f)
            lineToRelative(1f, 1f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            lineToRelative(3f, -3f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            close()
            moveTo(10.5f, 11f)
            curveToRelative(1.33f, 0f, 2.55f, -0.472f, 3.501f, -1.258f)
            verticalLineToRelative(0.755f)
            curveToRelative(0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-2.5f)
            verticalLineTo(13f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.275f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(11.775f, 14f, 11.5f, 14f)
            horizontalLineTo(4.495f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            reflectiveCurveTo(4.22f, 13f, 4.496f, 13f)
            horizontalLineTo(6f)
            verticalLineToRelative(-1.003f)
            horizontalLineTo(3.501f)
            curveToRelative(-0.829f, 0f, -1.5f, -0.671f, -1.5f, -1.5f)
            verticalLineTo(3.5f)
            curveToRelative(0f, -0.828f, 0.671f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(2.756f)
            curveTo(5.472f, 2.95f, 5f, 4.17f, 5f, 5.5f)
            curveTo(5f, 8.538f, 7.462f, 11f, 10.5f, 11f)
            close()
            moveTo(9f, 11.997f)
            horizontalLineTo(7f)
            verticalLineTo(13f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-1.003f)
            close()
        }
    }.build()
}
