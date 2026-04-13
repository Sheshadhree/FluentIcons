package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowExportLtr20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowExportLtr20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.5f, 4f)
            curveTo(2.776f, 4f, 3f, 4.224f, 3f, 4.5f)
            verticalLineToRelative(11f)
            curveTo(3f, 15.776f, 2.776f, 16f, 2.5f, 16f)
            reflectiveCurveTo(2f, 15.776f, 2f, 15.5f)
            verticalLineToRelative(-11f)
            curveTo(2f, 4.224f, 2.224f, 4f, 2.5f, 4f)
            close()
            moveTo(5f, 10f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(10.793f)
            lineToRelative(-3.147f, -3.146f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineToRelative(4f, 4f)
            curveToRelative(0.052f, 0.053f, 0.09f, 0.114f, 0.115f, 0.18f)
            curveTo(17.989f, 9.88f, 18f, 9.939f, 18f, 10f)
            curveToRelative(0f, 0.061f, -0.011f, 0.12f, -0.031f, 0.174f)
            curveToRelative(-0.024f, 0.066f, -0.063f, 0.127f, -0.115f, 0.18f)
            lineToRelative(-4f, 4f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.707f)
            lineToRelative(3.147f, -3.147f)
            horizontalLineTo(5.5f)
            curveTo(5.224f, 10.5f, 5f, 10.276f, 5f, 10f)
            close()
        }
    }.build()
}
