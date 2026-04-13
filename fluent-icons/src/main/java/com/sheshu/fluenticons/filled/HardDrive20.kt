package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HardDrive20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HardDrive20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 10f)
            curveToRelative(-0.588f, 0f, -1.136f, 0.169f, -1.599f, 0.461f)
            lineToRelative(2.25f, -5.249f)
            curveTo(4.966f, 4.477f, 5.689f, 4f, 6.489f, 4f)
            horizontalLineToRelative(7.104f)
            curveToRelative(0.742f, 0f, 1.43f, 0.41f, 1.763f, 1.088f)
            curveToRelative(0.544f, 1.106f, 1.53f, 3.207f, 2.333f, 5.432f)
            curveTo(17.208f, 10.192f, 16.626f, 10f, 16f, 10f)
            horizontalLineTo(4f)
            close()
            moveToRelative(12f, 1f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(3.987f)
            curveTo(2.888f, 15.993f, 2f, 15.1f, 2f, 14f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(12f)
            close()
            moveToRelative(-0.5f, 3.25f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            reflectiveCurveToRelative(-0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            close()
        }
    }.build()
}
