package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowHookUpLeft20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowHookUpLeft20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 15.5f)
            curveTo(6f, 15.776f, 6.224f, 16f, 6.5f, 16f)
            horizontalLineTo(11f)
            curveToRelative(1.636f, 0f, 2.9f, -0.618f, 3.749f, -1.574f)
            curveTo(15.59f, 13.479f, 16f, 12.232f, 16f, 11f)
            curveToRelative(0f, -1.232f, -0.41f, -2.48f, -1.251f, -3.426f)
            curveTo(13.899f, 6.618f, 12.636f, 6f, 11f, 6f)
            horizontalLineTo(5.707f)
            lineToRelative(2.647f, -2.647f)
            curveToRelative(0.195f, -0.195f, 0.195f, -0.511f, 0f, -0.707f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            lineToRelative(-3.5f, 3.5f)
            curveToRelative(-0.196f, 0.196f, -0.196f, 0.512f, 0f, 0.708f)
            lineToRelative(3.5f, 3.5f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.707f)
            lineTo(5.707f, 7f)
            horizontalLineTo(11f)
            curveToRelative(1.364f, 0f, 2.35f, 0.507f, 3.001f, 1.238f)
            curveTo(14.66f, 8.98f, 15f, 9.982f, 15f, 11f)
            reflectiveCurveToRelative(-0.34f, 2.02f, -0.999f, 2.762f)
            curveTo(13.351f, 14.493f, 12.364f, 15f, 11f, 15f)
            horizontalLineTo(6.5f)
            curveTo(6.224f, 15f, 6f, 15.224f, 6f, 15.5f)
            close()
        }
    }.build()
}
