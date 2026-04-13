package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LockClosed48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LockClosed48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 12f)
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
            verticalLineToRelative(-2f)
            close()
            moveToRelative(8f, -5.5f)
            curveToRelative(-3.038f, 0f, -5.5f, 2.462f, -5.5f, 5.5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(11f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -3.038f, -2.462f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(24f, 31f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            reflectiveCurveToRelative(-1.343f, -3f, -3f, -3f)
            reflectiveCurveToRelative(-3f, 1.343f, -3f, 3f)
            reflectiveCurveToRelative(1.343f, 3f, 3f, 3f)
            close()
        }
    }.build()
}
