package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Person24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Person24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.755f, 14f)
            curveToRelative(1.242f, 0f, 2.248f, 1.007f, 2.248f, 2.25f)
            verticalLineToRelative(0.918f)
            curveToRelative(0f, 0.573f, -0.179f, 1.132f, -0.512f, 1.598f)
            curveToRelative(-1.546f, 2.164f, -4.07f, 3.235f, -7.49f, 3.235f)
            curveToRelative(-3.422f, 0f, -5.945f, -1.072f, -7.487f, -3.236f)
            curveToRelative(-0.332f, -0.466f, -0.51f, -1.024f, -0.51f, -1.596f)
            verticalLineToRelative(-0.92f)
            curveTo(4.004f, 15.007f, 5.01f, 14f, 6.253f, 14f)
            horizontalLineToRelative(11.502f)
            close()
            moveTo(12f, 2.005f)
            curveToRelative(2.762f, 0f, 5f, 2.239f, 5f, 5f)
            reflectiveCurveToRelative(-2.238f, 5f, -5f, 5f)
            curveToRelative(-2.761f, 0f, -5f, -2.239f, -5f, -5f)
            reflectiveCurveToRelative(2.239f, -5f, 5f, -5f)
            close()
        }
    }.build()
}
