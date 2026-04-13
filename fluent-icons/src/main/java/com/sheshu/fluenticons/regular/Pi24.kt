package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Pi24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Pi24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.5f, 6.75f)
            curveTo(2.5f, 5.231f, 3.731f, 4f, 5.25f, 4f)
            horizontalLineToRelative(15f)
            curveTo(20.664f, 4f, 21f, 4.336f, 21f, 4.75f)
            reflectiveCurveTo(20.664f, 5.5f, 20.25f, 5.5f)
            horizontalLineTo(17f)
            verticalLineToRelative(11.453f)
            curveToRelative(0f, 1.21f, 1.199f, 2.055f, 2.339f, 1.648f)
            lineToRelative(0.159f, -0.057f)
            curveToRelative(0.39f, -0.14f, 0.819f, 0.064f, 0.958f, 0.454f)
            curveToRelative(0.14f, 0.39f, -0.064f, 0.819f, -0.454f, 0.958f)
            lineToRelative(-0.159f, 0.057f)
            curveTo(17.727f, 20.77f, 15.5f, 19.2f, 15.5f, 16.953f)
            verticalLineTo(5.5f)
            horizontalLineTo(9.494f)
            curveTo(9.49f, 5.74f, 9.482f, 6.06f, 9.468f, 6.444f)
            curveToRelative(-0.031f, 0.897f, -0.095f, 2.153f, -0.22f, 3.59f)
            curveToRelative(-0.252f, 2.862f, -0.759f, 6.498f, -1.79f, 9.462f)
            curveToRelative(-0.136f, 0.392f, -0.563f, 0.598f, -0.954f, 0.462f)
            curveToRelative(-0.392f, -0.136f, -0.598f, -0.563f, -0.462f, -0.954f)
            curveToRelative(0.969f, -2.787f, 1.462f, -6.275f, 1.71f, -9.1f)
            curveToRelative(0.125f, -1.407f, 0.186f, -2.636f, 0.217f, -3.512f)
            curveTo(7.982f, 6.03f, 7.99f, 5.729f, 7.994f, 5.5f)
            horizontalLineTo(5.25f)
            curveTo(4.56f, 5.5f, 4f, 6.06f, 4f, 6.75f)
            verticalLineToRelative(0.5f)
            curveTo(4f, 7.664f, 3.664f, 8f, 3.25f, 8f)
            reflectiveCurveTo(2.5f, 7.664f, 2.5f, 7.25f)
            verticalLineToRelative(-0.5f)
            close()
        }
    }.build()
}
