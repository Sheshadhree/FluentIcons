package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Drop24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Drop24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.47f, 2.22f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            curveToRelative(0.403f, 0.403f, 1.999f, 2.127f, 3.499f, 4.362f)
            curveTo(17.509f, 8.785f, 19f, 11.635f, 19f, 14.25f)
            curveToRelative(0f, 2.524f, -0.746f, 4.479f, -2.044f, 5.806f)
            curveTo(15.659f, 21.38f, 13.889f, 22f, 12f, 22f)
            curveToRelative(-1.89f, 0f, -3.659f, -0.619f, -4.956f, -1.944f)
            curveTo(5.746f, 18.729f, 5f, 16.774f, 5f, 14.25f)
            curveToRelative(0f, -2.615f, 1.492f, -5.465f, 2.971f, -7.668f)
            curveToRelative(1.5f, -2.235f, 3.096f, -3.96f, 3.499f, -4.362f)
            close()
        }
    }.build()
}
