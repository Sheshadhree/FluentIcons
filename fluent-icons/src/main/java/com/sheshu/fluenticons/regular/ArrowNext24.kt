package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowNext24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowNext24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.25f, 3f)
            curveToRelative(0.38f, 0f, 0.694f, 0.282f, 0.743f, 0.648f)
            lineTo(19f, 3.75f)
            verticalLineToRelative(16.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            curveToRelative(-0.38f, 0f, -0.694f, -0.282f, -0.743f, -0.648f)
            lineTo(17.5f, 20.25f)
            verticalLineTo(3.75f)
            curveTo(17.5f, 3.336f, 17.836f, 3f, 18.25f, 3f)
            close()
            moveTo(5.22f, 3.22f)
            curveToRelative(0.266f, -0.267f, 0.683f, -0.29f, 0.976f, -0.073f)
            lineTo(6.28f, 3.22f)
            lineToRelative(8.25f, 8.25f)
            curveToRelative(0.267f, 0.266f, 0.29f, 0.683f, 0.073f, 0.976f)
            lineTo(14.53f, 12.53f)
            lineToRelative(-8.25f, 8.25f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.267f, -0.266f, -0.29f, -0.683f, -0.073f, -0.976f)
            lineTo(5.22f, 19.72f)
            lineTo(12.94f, 12f)
            lineTo(5.22f, 4.28f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            close()
        }
    }.build()
}
