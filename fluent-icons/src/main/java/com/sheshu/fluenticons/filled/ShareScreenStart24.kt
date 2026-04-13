package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ShareScreenStart24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShareScreenStart24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.25f, 4f)
            curveTo(3.007f, 4f, 2f, 5.007f, 2f, 6.25f)
            verticalLineToRelative(11.5f)
            curveTo(2f, 18.993f, 3.007f, 20f, 4.25f, 20f)
            horizontalLineToRelative(15.5f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineTo(6.25f)
            curveTo(22f, 5.007f, 20.993f, 4f, 19.75f, 4f)
            horizontalLineTo(4.25f)
            close()
            moveToRelative(8.28f, 3.465f)
            lineToRelative(3.255f, 3.255f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(-0.293f, 0.293f, -0.768f, 0.293f, -1.06f, 0f)
            lineTo(12.75f, 9.806f)
            verticalLineToRelative(6.447f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineTo(9.808f)
            lineTo(9.28f, 11.78f)
            curveToRelative(-0.292f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.292f, -0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(3.25f, -3.255f)
            curveToRelative(0.14f, -0.14f, 0.33f, -0.22f, 0.53f, -0.22f)
            curveToRelative(0.199f, 0f, 0.39f, 0.08f, 0.53f, 0.22f)
            close()
        }
    }.build()
}
