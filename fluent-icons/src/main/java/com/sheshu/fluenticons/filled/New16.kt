package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.New16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.New16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.75f, 10.999f)
            horizontalLineToRelative(4.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.335f, 0.75f, 0.75f)
            curveToRelative(0f, 0.38f, -0.282f, 0.693f, -0.648f, 0.743f)
            lineTo(8.25f, 12.499f)
            horizontalLineToRelative(-4.5f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            curveToRelative(0f, -0.38f, 0.282f, -0.694f, 0.648f, -0.743f)
            lineToRelative(0.102f, -0.007f)
            horizontalLineToRelative(4.5f)
            horizontalLineToRelative(-4.5f)
            close()
            moveToRelative(1.47f, -5.78f)
            curveToRelative(0.266f, -0.266f, 0.683f, -0.29f, 0.976f, -0.072f)
            lineTo(6.28f, 5.22f)
            lineToRelative(3.5f, 3.5f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(-0.266f, 0.267f, -0.683f, 0.29f, -0.976f, 0.073f)
            lineTo(8.72f, 9.78f)
            lineToRelative(-3.5f, -3.5f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            close()
            moveTo(11.75f, 3f)
            curveToRelative(0.38f, 0f, 0.694f, 0.282f, 0.743f, 0.648f)
            lineTo(12.5f, 3.75f)
            verticalLineToRelative(4.5f)
            curveTo(12.5f, 8.664f, 12.164f, 9f, 11.75f, 9f)
            curveToRelative(-0.38f, 0f, -0.694f, -0.282f, -0.743f, -0.648f)
            lineTo(11f, 8.25f)
            verticalLineToRelative(-4.5f)
            curveTo(11f, 3.336f, 11.336f, 3f, 11.75f, 3f)
            close()
        }
    }.build()
}
