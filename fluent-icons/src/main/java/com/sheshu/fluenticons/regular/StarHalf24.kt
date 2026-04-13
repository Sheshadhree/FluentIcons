package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.StarHalf24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.StarHalf24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 2.35f)
            curveToRelative(-0.482f, 0f, -0.964f, 0.25f, -1.212f, 0.752f)
            lineTo(8.43f, 7.88f)
            lineTo(3.157f, 8.646f)
            curveToRelative(-1.107f, 0.16f, -1.55f, 1.522f, -0.748f, 2.303f)
            lineToRelative(3.815f, 3.719f)
            lineToRelative(-0.9f, 5.25f)
            curveToRelative(-0.15f, 0.874f, 0.544f, 1.583f, 1.331f, 1.582f)
            curveToRelative(0.208f, 0f, 0.422f, -0.05f, 0.63f, -0.158f)
            lineToRelative(4.714f, -2.479f)
            lineToRelative(4.715f, 2.479f)
            curveToRelative(0.99f, 0.52f, 2.148f, -0.32f, 1.96f, -1.423f)
            lineToRelative(-0.902f, -5.251f)
            lineToRelative(3.816f, -3.72f)
            curveToRelative(0.8f, -0.78f, 0.359f, -2.141f, -0.748f, -2.302f)
            lineTo(15.567f, 7.88f)
            lineToRelative(-2.358f, -4.778f)
            curveToRelative(-0.247f, -0.501f, -0.729f, -0.752f, -1.21f, -0.752f)
            close()
            moveToRelative(0f, 14.993f)
            verticalLineTo(4.042f)
            lineToRelative(2.257f, 4.572f)
            curveToRelative(0.196f, 0.399f, 0.577f, 0.675f, 1.016f, 0.739f)
            lineToRelative(5.05f, 0.734f)
            lineToRelative(-3.654f, 3.562f)
            curveToRelative(-0.318f, 0.31f, -0.463f, 0.757f, -0.388f, 1.195f)
            lineToRelative(0.862f, 5.029f)
            lineToRelative(-4.516f, -2.375f)
            curveToRelative(-0.197f, -0.103f, -0.412f, -0.155f, -0.627f, -0.155f)
            close()
        }
    }.build()
}
