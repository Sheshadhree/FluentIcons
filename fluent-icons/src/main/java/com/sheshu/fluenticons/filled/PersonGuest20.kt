package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonGuest20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonGuest20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 10f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineToRelative(-3f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(3f)
            close()
            moveToRelative(-5.826f, 1f)
            curveTo(11.064f, 11.313f, 11f, 11.649f, 11f, 12f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.283f, 0.041f, 0.556f, 0.114f, 0.815f)
            curveTo(10.442f, 17.938f, 9.731f, 18f, 9f, 18f)
            curveToRelative(-1.855f, 0f, -3.583f, -0.386f, -4.865f, -1.203f)
            curveTo(2.833f, 15.967f, 2f, 14.69f, 2f, 13f)
            curveToRelative(0f, -1.113f, 0.903f, -2f, 2.009f, -2f)
            horizontalLineToRelative(7.165f)
            close()
            moveToRelative(3.326f, 1f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(16.776f, 12f, 16.5f, 12f)
            horizontalLineToRelative(-2f)
            close()
            moveTo(9f, 2f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
            reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
            reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
            close()
        }
    }.build()
}
