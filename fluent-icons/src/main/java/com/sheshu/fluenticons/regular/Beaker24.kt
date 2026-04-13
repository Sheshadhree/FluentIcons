package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Beaker24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Beaker24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 4.5f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(6.238f)
            curveToRelative(0f, 0.375f, -0.094f, 0.744f, -0.273f, 1.074f)
            lineToRelative(-3.584f, 6.603f)
            curveTo(4.51f, 19.581f, 5.353f, 21f, 6.68f, 21f)
            horizontalLineToRelative(10.638f)
            curveToRelative(1.327f, 0f, 2.171f, -1.419f, 1.538f, -2.585f)
            lineToRelative(-3.584f, -6.603f)
            curveTo(15.093f, 11.482f, 15f, 11.113f, 15f, 10.738f)
            verticalLineTo(4.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(16.414f, 3f, 16f, 3f)
            horizontalLineTo(8f)
            curveTo(7.586f, 3f, 7.25f, 3.336f, 7.25f, 3.75f)
            reflectiveCurveTo(7.586f, 4.5f, 8f, 4.5f)
            close()
            moveToRelative(2.5f, 6.238f)
            verticalLineTo(4.5f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(6.238f)
            curveToRelative(0f, 0.625f, 0.156f, 1.24f, 0.454f, 1.79f)
            lineToRelative(0.8f, 1.472f)
            horizontalLineTo(9.246f)
            lineToRelative(0.8f, -1.473f)
            curveToRelative(0.298f, -0.549f, 0.454f, -1.164f, 0.454f, -1.789f)
            close()
            moveTo(8.432f, 15.5f)
            horizontalLineToRelative(7.136f)
            lineToRelative(1.971f, 3.63f)
            curveToRelative(0.09f, 0.167f, -0.03f, 0.37f, -0.22f, 0.37f)
            horizontalLineTo(6.681f)
            curveToRelative(-0.19f, 0f, -0.31f, -0.203f, -0.22f, -0.37f)
            lineToRelative(1.97f, -3.63f)
            close()
        }
    }.build()
}
