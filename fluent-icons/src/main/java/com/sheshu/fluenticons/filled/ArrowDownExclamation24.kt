package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowDownExclamation24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowDownExclamation24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 2.75f)
            curveTo(18f, 2.336f, 17.664f, 2f, 17.25f, 2f)
            reflectiveCurveTo(16.5f, 2.336f, 16.5f, 2.75f)
            verticalLineToRelative(16.69f)
            lineToRelative(-2.22f, -2.22f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(3.5f, 3.5f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(3.5f, -3.5f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineTo(18f, 19.44f)
            verticalLineTo(2.75f)
            close()
            moveTo(3.125f, 5.877f)
            curveToRelative(0f, -2.14f, 1.735f, -3.875f, 3.875f, -3.875f)
            curveToRelative(2.14f, 0f, 3.876f, 1.735f, 3.876f, 3.875f)
            curveToRelative(0f, 2.95f, -1.205f, 6.564f, -1.811f, 8.204f)
            curveToRelative(-0.324f, 0.876f, -1.16f, 1.418f, -2.062f, 1.418f)
            curveToRelative(-0.906f, 0f, -1.742f, -0.545f, -2.065f, -1.423f)
            curveToRelative(-0.606f, -1.647f, -1.813f, -5.28f, -1.813f, -8.199f)
            close()
            moveTo(4.5f, 19.502f)
            curveToRelative(0f, -1.381f, 1.12f, -2.501f, 2.501f, -2.501f)
            curveToRelative(1.381f, 0f, 2.501f, 1.12f, 2.501f, 2.501f)
            curveToRelative(0f, 1.381f, -1.12f, 2.501f, -2.5f, 2.501f)
            curveToRelative(-1.382f, 0f, -2.502f, -1.12f, -2.502f, -2.5f)
            close()
        }
    }.build()
}
