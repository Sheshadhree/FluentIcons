package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowSprint16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowSprint16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 5.5f)
            curveToRelative(-0.436f, 0f, -0.84f, 0.14f, -1.168f, 0.377f)
            curveTo(6.328f, 6.24f, 6f, 6.832f, 6f, 7.5f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(4.44f)
            lineToRelative(-0.22f, -0.22f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            lineToRelative(1.5f, 1.5f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(-1.5f, 1.5f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineTo(12.44f, 11f)
            horizontalLineTo(8f)
            curveToRelative(-1.933f, 0f, -3.5f, -1.567f, -3.5f, -3.5f)
            curveToRelative(0f, -0.627f, 0.165f, -1.216f, 0.454f, -1.725f)
            curveTo(5.556f, 4.715f, 6.694f, 4f, 8f, 4f)
            curveToRelative(1.933f, 0f, 3.5f, 1.567f, 3.5f, 3.5f)
            verticalLineToRelative(0.025f)
            curveToRelative(-0.27f, 0.276f, -0.431f, 0.62f, -0.482f, 0.975f)
            horizontalLineTo(9.732f)
            curveTo(9.902f, 8.206f, 10f, 7.864f, 10f, 7.5f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            close()
            moveToRelative(-5.25f, 4f)
            horizontalLineToRelative(1.218f)
            curveToRelative(0.29f, 0.583f, 0.702f, 1.094f, 1.203f, 1.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 11f, 2f, 10.664f, 2f, 10.25f)
            reflectiveCurveTo(2.336f, 9.5f, 2.75f, 9.5f)
            close()
        }
    }.build()
}
