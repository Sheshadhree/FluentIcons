package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DataArea20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DataArea20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.75f, 2f)
            curveTo(3.164f, 2f, 3.5f, 2.336f, 3.5f, 2.75f)
            verticalLineToRelative(12.5f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(12.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(17.664f, 18f, 17.25f, 18f)
            horizontalLineTo(4.75f)
            curveTo(3.231f, 18f, 2f, 16.769f, 2f, 15.25f)
            verticalLineTo(2.75f)
            curveTo(2f, 2.336f, 2.336f, 2f, 2.75f, 2f)
            close()
            moveTo(16f, 5.5f)
            verticalLineToRelative(10f)
            horizontalLineTo(4.75f)
            curveToRelative(-0.138f, 0f, -0.25f, -0.112f, -0.25f, -0.25f)
            verticalLineTo(8.064f)
            lineToRelative(2.297f, -1.02f)
            curveTo(6.943f, 6.978f, 7.11f, 6.986f, 7.248f, 7.065f)
            lineToRelative(3.205f, 1.831f)
            lineToRelative(4.735f, -3.787f)
            curveToRelative(0.15f, -0.12f, 0.355f, -0.144f, 0.529f, -0.06f)
            curveTo(15.89f, 5.132f, 16f, 5.307f, 16f, 5.5f)
            close()
        }
    }.build()
}
