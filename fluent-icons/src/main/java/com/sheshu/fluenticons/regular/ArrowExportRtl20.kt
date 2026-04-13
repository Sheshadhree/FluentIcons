package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowExportRtl20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowExportRtl20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.5f, 4f)
            curveTo(17.224f, 4f, 17f, 4.224f, 17f, 4.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-11f)
            curveTo(18f, 4.224f, 17.776f, 4f, 17.5f, 4f)
            close()
            moveTo(15f, 10f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineTo(3.707f)
            lineToRelative(3.147f, -3.146f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineToRelative(-4f, 4f)
            curveTo(2.094f, 9.7f, 2.056f, 9.76f, 2.031f, 9.826f)
            curveTo(2.011f, 9.88f, 2f, 9.939f, 2f, 10f)
            curveToRelative(0f, 0.061f, 0.011f, 0.12f, 0.031f, 0.174f)
            curveToRelative(0.024f, 0.066f, 0.063f, 0.127f, 0.115f, 0.18f)
            lineToRelative(4f, 4f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.707f)
            lineTo(3.707f, 10.5f)
            horizontalLineTo(14.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            close()
        }
    }.build()
}
