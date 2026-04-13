package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LockClosed48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LockClosed48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(27f, 28f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            reflectiveCurveToRelative(1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            close()
            moveTo(16f, 14f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -4.418f, 3.582f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.582f, 8f, 8f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(1.75f)
            curveToRelative(3.452f, 0f, 6.25f, 2.798f, 6.25f, 6.25f)
            verticalLineToRelative(15.5f)
            curveToRelative(0f, 3.452f, -2.798f, 6.25f, -6.25f, 6.25f)
            horizontalLineToRelative(-19.5f)
            curveTo(10.798f, 42f, 8f, 39.202f, 8f, 35.75f)
            verticalLineToRelative(-15.5f)
            curveTo(8f, 16.798f, 10.798f, 14f, 14.25f, 14f)
            horizontalLineTo(16f)
            close()
            moveToRelative(2.5f, -2f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(11f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -3.038f, -2.462f, -5.5f, -5.5f, -5.5f)
            reflectiveCurveToRelative(-5.5f, 2.462f, -5.5f, 5.5f)
            close()
            moveToRelative(-4.25f, 4.5f)
            curveToRelative(-2.071f, 0f, -3.75f, 1.679f, -3.75f, 3.75f)
            verticalLineToRelative(15.5f)
            curveToRelative(0f, 2.071f, 1.679f, 3.75f, 3.75f, 3.75f)
            horizontalLineToRelative(19.5f)
            curveToRelative(2.071f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineToRelative(-15.5f)
            curveToRelative(0f, -2.071f, -1.679f, -3.75f, -3.75f, -3.75f)
            horizontalLineToRelative(-19.5f)
            close()
        }
    }.build()
}
